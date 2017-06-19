package com.xawl.car.utils;

import com.jcraft.jsch.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Vector;

/**
 * Created by Administrator on 2016/12/19.
 */
public class SFTPTool {
    private static Session session;
    private static Channel channel;
    private static ChannelSftp sftp;// sftp操作类

    /**
     * 连接sftp
     * 构造函数
     *
     * @param host
     * @param port
     * @param username
     * @param password
     * @throws Exception
     */
    public SFTPTool(String host, int port, String username, String password) throws Exception {
        getConnect(host, port, username, password);
    }


    /**
     * 连接sftp服务器
     *
     * @param host     主机
     * @param port     端口
     * @param username 密码
     * @return
     * @throws Exception
     */
    private static ChannelSftp getConnect(String host, int port, String username, String password) throws Exception {
        JSch jsch = new JSch();
        session = jsch.getSession(username, host, port);
        session.setPassword(password);
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no"); // 不验证 HostKey
        session.setConfig(config);
        try {
            session.connect();
        } catch (Exception e) {
            if (session.isConnected())
                session.disconnect();
            throw new Exception("连接服务器失败,请检查主机[" + host + "],端口[" + port
                    + "],用户名[" + username + "],端口[" + port
                    + "]是否正确,以上信息正确的情况下请检查网络连接是否正常或者请求被防火墙拒绝.");
        }
        channel = session.openChannel("sftp");
        try {
            channel.connect();
        } catch (Exception e) {
            if (channel.isConnected())
                channel.disconnect();
            throw new Exception("连接服务器失败,请检查主机[" + host + "],端口[" + port
                    + "],用户名[" + username + "],密码[" + password
                    + "]是否正确,以上信息正确的情况下请检查网络连接是否正常或者请求被防火墙拒绝.");
        }
        sftp = (ChannelSftp) channel;

        return sftp;
    }

    /**
     * 断开连接
     */
    private static void disConn() {
        if (null != sftp) {
            sftp.disconnect();
            sftp.exit();
            sftp = null;
        }
        if (null != channel) {
            channel.disconnect();
            channel = null;
        }
        if (null != session) {
            session.disconnect();
            session = null;
        }
    }

    /**
     * 上传文件,同时断开连接
     *
     * @param directory  上传指定的路径
     * @param uploadFile 需要上传的文件的路径级文件名
     * @throws Exception
     */
    public void upload(String directory, String uploadFile) throws Exception {
        try {
            if (!directory.equals("") && directory.trim() != "") {
                try {
                    sftp.cd(directory);
                } catch (SftpException sException) {
                    if (sftp.SSH_FX_NO_SUCH_FILE == sException.id) { //指定上传路径不存在
                        sftp.mkdir(directory);
                        sftp.cd(directory);
                    }
                }
            }
            File file = new File(uploadFile);
            sftp.put(new FileInputStream(file), file.getName());
        } catch (Exception e) {
            throw new Exception(e.getMessage(), e);
        } finally {
            disConn();
        }
    }

    /**
     * 下载文件,同时断开连接
     *
     * @param directory    下载目录
     * @param downloadFile 下载的文件名
     * @param saveFile     存在本地的全路径
     * @throws Exception
     */
    public void download(String directory, String downloadFile, String saveFile) throws Exception {
        try {
            sftp.cd(directory);
            File file = new File(saveFile);
            boolean bFile;
            bFile = false;
            bFile = file.exists();
            if (!bFile) {
                bFile = file.mkdirs();
            }
            sftp.get(downloadFile, new FileOutputStream(new File(saveFile, downloadFile)));
        } catch (Exception e) {
            throw new Exception(e.getMessage(), e);
        } finally {
            disConn();
        }
    }

    /**
     * 删除文件,同时断开连接
     *
     * @param directory  要删除文件所在目录
     * @param deleteFile 要删除的文件名
     * @throws Exception
     */
    public void delete(String directory, String deleteFile) throws Exception {
        try {
            sftp.cd(directory);
            sftp.rm(deleteFile);
        } catch (Exception e) {
            throw new Exception(e.getMessage(), e);
        } finally {
            disConn();
        }
    }


    /**
     * 列出目录下的文件
     *
     * @param directory 要列出的文件
     * @return
     * @throws SftpException
     */
    public Vector listFiles(String directory) throws SftpException {
        Vector vec = sftp.ls(directory);
        disConn();
        return vec;
    }

    /**
     * 用于查询某个远程目录下的文件名称
     *
     * @param directory 远程目录
     * @param valiStr
     * @return
     * @throws SftpException
     */
    public Vector<String> listFileNames(String directory, String valiStr)
            throws SftpException {
        Vector<String> ret = new Vector<String>();
        System.out.println("------");
        for (Object obj : sftp.ls(directory)) {
            String curStr = obj.toString();
            curStr = curStr.substring(curStr.lastIndexOf(" ") + 1);

            if (curStr.contains(valiStr)) {
                ret.add(curStr);
            }
        }
        disConn();
        return ret;
    }



}
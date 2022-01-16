package cn.enjoyedu.rpc.remote;


import cn.enjoyedu.rpc.remote.vo.UserInfo;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：短信息发送接口
 */
public interface SendSms {
    /*发送短信*/
    boolean sendMail(UserInfo user);

}

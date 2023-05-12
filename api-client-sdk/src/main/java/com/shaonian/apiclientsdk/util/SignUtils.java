package com.shaonian.apiclientsdk.util;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

public class SignUtils {

    /**
     * 生成签名
     * @param body
     * @param secretkey
     * @return
     */
    public static String getSign(String body, String secretkey){
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body.toString()+"."+secretkey;
        return md5.digestHex(content);
    }

}

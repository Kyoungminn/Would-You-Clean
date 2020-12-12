package com.example.registerlogin;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
//생성자를 만들어달라는 오류가 발생한다.
//서버 URL 설정

public class LoginRequest extends StringRequest {
    //서버 URL 설정(PHP 파일 연동)
    final static private String URL = "http://eangwoo.dothome.co.kr/Login.php";
    private Map<String, String> map;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}

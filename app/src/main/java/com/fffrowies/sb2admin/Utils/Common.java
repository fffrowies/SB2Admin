package com.fffrowies.sb2admin.Utils;

import com.fffrowies.sb2admin.Retrofit.ISB2AdminAPI;
import com.fffrowies.sb2admin.Retrofit.RetrofitClient;

public class Common {
    //In emulator localhost = 10.0.2.2
    private static final String BASE_URL = "http://10.0.2.2/sb2admin/";

    public static ISB2AdminAPI getAPI() {
        return RetrofitClient.getClient(BASE_URL).create(ISB2AdminAPI.class);
    }
}

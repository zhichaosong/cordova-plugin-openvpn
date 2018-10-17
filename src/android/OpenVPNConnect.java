package com.de.cordova.vpn;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * OpenVPN连接cordova插件android端
 *
 * @author zhichaosong
 * @date 2018.10.17
 */
public class OpenVPNConnect extends CordovaPlugin {
    /**
     * JS回调接口对象
     */
    public static CallbackContext cbCtx = null;

    /**
     * 插件主入口
     */
    @Override
    public boolean execute(String action, final JSONArray args, CallbackContext callbackContext) throws JSONException {
        cbCtx = callbackContext;
        if ("getStatus".equalsIgnoreCase(action)) {
            return true;
        }

        return false;
    }
}

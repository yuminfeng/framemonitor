package com.vip001.monitor.services;

import android.os.Message;
import android.os.Messenger;

/**
 * Created by xxd on 2018/10/5.
 */

public interface IMessageHandler {
    boolean handleMessage(Message msg, RemoteBackgroundService.Env env);
}

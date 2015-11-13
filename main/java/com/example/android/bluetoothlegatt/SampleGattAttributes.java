/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    /*
    * public static String HEART_RATE_SERVICE = "00002902-0000-1000-8000-00805f9b34fb";
    * public static String HEART_RATE_MEASUREMENT = "00002902-0000-1000-8000-00805f9b34fb";
    * public static String HEART_RATE_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    *
    * */

    static {
        // Sample Services.
//        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
//        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");

        //pedometer characteristics UUID constants
        attributes.put("68c10001-801a-11e5-8bcf-feff819cdc9f", "Pedometer Service");
        attributes.put("68c10003-801a-11e5-8bcf-feff819cdc9f", "Pedometer Status");
        attributes.put("68c10002-801a-11e5-8bcf-feff819cdc9f", "Pedometer Step Count");

        //GPS characteristics UUID constants
        attributes.put("58c10001-801a-11e5-8bcf-feff819cdc9f", "GPS Service");
        attributes.put("58c10004-801a-11e5-8bcf-feff819cdc9f", "GPS Status");
        attributes.put("58c10002-801a-11e5-8bcf-feff819cdc9f", "GPS Location");
        attributes.put("58c10003-801a-11e5-8bcf-feff819cdc9f", "GPS Speed");


        /*
        * attributes.put("HEART_RATE_SERVICE", "Heart Rate Service");
        * attributes.put("HEART_RATE_MEASUREMENT", "Heart Rate Measurement");
        * attributes.put("HEART_RATE_CONFIG", "Heart Rate Config");
        *
        * attributes.put("58c10001-801a-11e5-8bcf-feff819cdc9f", "GPS Service");
        *attributes.put("58c10004-801a-11e5-8bcf-feff819cdc9f", "GPS Status");
        *attributes.put("58c10002-801a-11e5-8bcf-feff819cdc9f", "GPS Location");
        * attributes.put("58c10003-801a-11e5-8bcf-feff819cdc9f", "GPS Speed");
        *attributes.put("58c1XXXX-801a-11e5-8bcf-feff819cdc9f", "GPS Config");
        *
        * attributes.put("68c10001-801a-11e5-8bcf-feff819cdc9f", "Pedometer Service");
        * attributes.put("68c10003-801a-11e5-8bcf-feff819cdc9f", "Pedometer Status");
        * attributes.put("68c10002-801a-11e5-8bcf-feff819cdc9f", "Pedometer Step Count");
        * attributes.put("68c1XXXX-801a-11e5-8bcf-feff819cdc9f", "Pedometer Step Count Config");
        *
        * */

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}

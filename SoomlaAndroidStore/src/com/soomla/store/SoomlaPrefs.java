/*
 * Copyright (C) 2012 Soomla Inc.
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
package com.soomla.store;


public class SoomlaPrefs {

    /* Dialog types Consts */
    public static final int DIALOG_CANNOT_CONNECT_ID = 1;
    public static final int DIALOG_BILLING_NOT_SUPPORTED_ID = 2;
    public static final int DIALOG_SUBSCRIPTIONS_NOT_SUPPORTED_ID = 3;

    // do you want to print out debug messages?
    public static boolean debug = false;

    public static byte[] obfuscationSalt = new byte[] { 64, -54, -113, -47, 98, -52, 87, -102, -65, -127, 89, 51, -11, -35, 30, 77, -45, 75, -26, 3 };
}
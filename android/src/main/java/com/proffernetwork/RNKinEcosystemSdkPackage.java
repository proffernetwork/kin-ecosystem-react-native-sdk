
package com.proffernetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
public class RNKinEcosystemSdkPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      return Arrays.<NativeModule>asList(new RNKinEcosystemSdkModule(reactContext));
    }

    // Deprecated from RN 0.47
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }

    @ReactMethod
    public void getCachedBalance(final Callback callback) {
        try {
            Balance cachedBalance = Kin.getCachedBalance();
            callback.invoke(null, cachedBalance);

        } catch (ClientException e) {
            callback.invoke("Error", e);
        }
    }

    @ReactMethod
    public void getBalance(final Callback callback) {
        try {
            Balance cachedBalance = Kin.getCachedBalance();
            callback.invoke(null, cachedBalance);

        } catch (ClientException e) {
            callback.invoke("Error", e);
        }
    }
}
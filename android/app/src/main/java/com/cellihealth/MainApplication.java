package com.cellihealth;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.inprogress.reactnativeyoutube.ReactNativeYouTube;
import com.brentvatne.react.ReactVideoPackage;
import com.horcrux.svg.SvgPackage;
import com.reactnative.samsunghealth.SamsungHealthPackage;
import com.pushwoosh.reactnativeplugin.PushwooshPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;
import com.robinpowered.react.Intercom.IntercomPackage;
import com.imagepicker.ImagePickerPackage;
import com.i18n.reactnativei18n.ReactNativeI18n;
import com.reactnative.googlefit.GoogleFitPackage;
import com.evollu.react.fa.FIRAnalyticsPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.smixx.fabric.FabricPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.lwansbrough.RCTCamera.RCTCameraPackage;
import com.calendarevents.CalendarEventsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new ReactNativeYouTube(),
            new ReactVideoPackage(),
            new SvgPackage(),
            new SamsungHealthPackage(),
            new PushwooshPackage(),
            new MapsPackage(),
            new ReactNativeLocalizationPackage(),
            new IntercomPackage(),
            new ImagePickerPackage(),
            new ReactNativeI18n(),
            new GoogleFitPackage(),
            new FIRAnalyticsPackage(),
            new FBSDKPackage(),
            new FabricPackage(),
            new RNDeviceInfo(),
            new RCTCameraPackage(),
            new CalendarEventsPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}

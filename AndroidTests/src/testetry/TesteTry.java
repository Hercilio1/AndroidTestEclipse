/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetry;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author lima
 */
public class TesteTry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        // Caminho ate apk -> deve ser buildada
        String apkPath = "/home/hercilio/Documentos/EngDeSoftware/AGES-1/Adoções/adocoes-android/app/build/outputs/apk/app-debug.apk";
        // Nome do device
        String deviceName = "Android Emulator - Nexus_5X_API_24:5554";
        
        File ioApp = new File(apkPath);
        DesiredCapabilities dCap = new DesiredCapabilities();
        dCap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        dCap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        dCap.setCapability(MobileCapabilityType.APP, ioApp.getAbsolutePath());

        @SuppressWarnings("rawtypes")
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dCap);
        
        driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).click();
    }
    
}
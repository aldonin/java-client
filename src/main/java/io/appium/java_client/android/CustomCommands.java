package io.appium.java_client.android;

import io.appium.java_client.DisplayMetrics;
import io.appium.java_client.Owner;
import io.appium.java_client.PackageVersion;

import java.awt.*;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dolf on 10.11.15
 */
public interface CustomCommands {
    void stopApp();
    void stopApp(String pkg);
    void replaceApp(String path);
    List<String> listFiles(String dir);
    List<String> listFolder(String dir);
    void removeFile(String path);
    void removeFolder(String path);
    void broadcastIntent(String intent, String receiver, HashMap<String, Object> keys);
    boolean isSoftKeyboardPresent();
    void swipeUpHomeButton();
    void clearData();
    void clearData(String pkg);
    void adbSwipe(int x1, int y1, int x2, int y2, int duration, int sleep);
    void adbSwipe(int x1, int y1, int x2, int y2, int duration);
    void adbTap(int x, int y);
    void adbInputText(String text);
    Rectangle getNavigationBarRegion();
    DisplayMetrics getDisplayMetrics();
    long getDate();
    String getDateString();
    void setDate(long time);
    boolean hasRoot();
    List<PackageVersion> getVersions(String pkg);
    Owner getOwner(String path);
    void setOwner(String path, Owner owner);
    void cp(String source, String destination);
    void startAction(String action, String data);
    void startAction(String action, String category, String data);
    void download(URL url, String destination);
    void unzip(String path);
    void setOwnerRecursively(String path, Owner owner);
    List<String> runAdbShellCommand(String command);
}

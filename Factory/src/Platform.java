public abstract class Platform {
    public void setRefreshRate() {

    }
    public void setTheme() {

    }
    public static Platform getPlatform(String platform) {
        return PlatformFactory.getPlatform(platform);
    }

    public abstract UIComponentFactory createUIComponentFactory();
}

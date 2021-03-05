package com.company;

public class Gaming extends Laptop implements Printable{

    //attributes
    //ADDITIONAL INFORMATION
    private String _secondScreen; //Второй экран
    private String _thinCorners; //Тонькие углы
    private String _backlitKeyboard; //Подсветка клавиатуры

    //constructors
    public Gaming() {
        super();
    }

    public Gaming(String _secondScreen, String _thinCorners, String _backlitKeyboard) {
        this._secondScreen = _secondScreen;
        this._thinCorners = _thinCorners;
        this._backlitKeyboard = _backlitKeyboard;
    }

    public Gaming(String _brand, String _model, String _OS_name, String _countryOfOrigin, String _manufacturer, String _screenType, double _diagonal, String _screenResolution, String _screenFrequency, String _modelCPU, int _RAM_size, String _hardDiskType, int _driveVolume, String _videoAdapter, String _graphicsCardType, int vVideoAdapterMemory, String _interfaces, String _wirelessConnection, String _ultrabook, String _webCamera, String _microphone, String _builtInSpeakers, int _batteryCapacity, int _continuousWorkTim, String _equipment, double _theWeight, ColorNewLaprtom _color, String _secondScreen, String _thinCorners, String _backlitKeyboard) {
        super(_brand, _model, _OS_name, _countryOfOrigin, _manufacturer, _screenType, _diagonal, _screenResolution, _screenFrequency, _modelCPU, _RAM_size, _hardDiskType, _driveVolume, _videoAdapter, _graphicsCardType, vVideoAdapterMemory, _interfaces, _wirelessConnection, _ultrabook, _webCamera, _microphone, _builtInSpeakers, _batteryCapacity, _continuousWorkTim, _equipment, _theWeight, _color);
        this._secondScreen = _secondScreen;
        this._thinCorners = _thinCorners;
        this._backlitKeyboard = _backlitKeyboard;
    }

    //methods
    @Override
    public void print() {
        System.out.printf("\n%-20s|%-50s","LAPTOP","CLASS_GAMING");
        System.out.printf("\n--------------------|------------\n");
        System.out.printf("%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n" +
                        "%-20s|%-40s\n%-20s|%-40.1f\n%-20s|%-40s\n%-20s|%-40s\n" +
                        "%-20s|%-40s\n" +
                        "%-20s|%-40d\n%-20s|%-40s\n%-20s|%-40d\n" +
                        "%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40d\n" +
                        "%-20s|%-40s\n%-20s|%-40s\n" +
                        "%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40d\n%-20s|%-40d\n%-20s|%-40s\n" +
                        "%-20s|%-40.2f\n%-20s|%-40s\n",
                //MAIN CHARACTERISTICS
                "BRAND", get_brand(),
                "MODEL", get_model(),
                "OS_NAME", get_OS_name(),
                "COUNTRY_OF_ORIGIN", get_countryOfOrigin(),
                "MANUFACTURER", get_manufacturer(),
                //DISPLAY
                "SCREEN_TYPE", get_screenType(),
                "DIAGONAL", get_diagonal(),
                "SCREE_RESOLUTION", get_screenResolution(),
                "SCREEN_FREQUENCY", get_screenFrequency(),
                //CPU
                "MODEL_CPU", get_modelCPU(),
                //MEMORY
                "RAM_SIZE", get_RAM_size(),
                "HARD_DISK_TYPE", get_hardDiskType(),
                "HARD_DISK_SPACE", get_driveVolume(),
                //VIDEO CARD
                "VIDEO_ADAPTER",get_videoAdapter(),
                "GRAPHICS_CARD_TYPE", get_graphicsCardType(),
                "VIDEO_ADAPTER_MEMORY", getvVideoAdapterMemory(),
                //CONNECTORS AND INTERFACES
                "INTERFACES", get_interfaces(),
                "WIRELESS_CONNECTION", get_wirelessConnection(),
                //ADDITIONAL INFORMATION
                "SECOND_SCREEN", get_secondScreen(),
                "THIN_CORNERS", get_thinCorners(),
                "BACKLIT_KEYBOARD", get_backlitKeyboard(),
                "ULTRABOOK", get_ultrabook(),
                "WEB_CAMERA", get_webCamera(),
                "MICROPHONE", get_microphone(),
                "BUILT_IN_SPEAKERS", get_builtInSpeakers(),
                "BATTERY_CAPACITY", get_batteryCapacity(),
                "CONTINUOUS_WORK_TIM", get_continuousWorkTim(),
                "EQUIPMENT", get_equipment(),
                //DIMENSIONS, WEIGHT
                "THE_WEIGHT", get_theWeight(),
                "COLOR_LAPTOP", get_color()
        );
    }


    //getters or setters
    public String get_secondScreen() {
        return _secondScreen;
    }

    public void set_secondScreen(String _secondScreen) {
        this._secondScreen = _secondScreen;
    }

    public String get_thinCorners() {
        return _thinCorners;
    }

    public void set_thinCorners(String _thinCorners) {
        this._thinCorners = _thinCorners;
    }

    public String get_backlitKeyboard() {
        return _backlitKeyboard;
    }

    public void set_backlitKeyboard(String _backlitKeyboard) {
        this._backlitKeyboard = _backlitKeyboard;
    }
}

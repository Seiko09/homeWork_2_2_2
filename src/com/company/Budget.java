package com.company;

public class Budget extends Laptop implements Printable{

    //attributes
    //ADDITIONAL INFORMATION
    private String _drive; //Дисковод есть? да/нет

    //constructors
    public Budget()
    {
        super();
    }

    public Budget(String _drive) {
        this._drive = _drive;
    }

    public Budget(String _brand, String _model, String _OS_name, String _countryOfOrigin, String _manufacturer, String _screenType, double _diagonal, String _screenResolution, String _screenFrequency, String _modelCPU, int _RAM_size, String _hardDiskType, int _driveVolume, String _videoAdapter, String _graphicsCardType, int vVideoAdapterMemory, String _interfaces, String _wirelessConnection, String _ultrabook, String _webCamera, String _microphone, String _builtInSpeakers, int _batteryCapacity, int _continuousWorkTim, String _equipment, double _theWeight, ColorNewLaprtom _color, String _drive) {
        super(_brand, _model, _OS_name, _countryOfOrigin, _manufacturer, _screenType, _diagonal, _screenResolution, _screenFrequency, _modelCPU, _RAM_size, _hardDiskType, _driveVolume, _videoAdapter, _graphicsCardType, vVideoAdapterMemory, _interfaces, _wirelessConnection, _ultrabook, _webCamera, _microphone, _builtInSpeakers, _batteryCapacity, _continuousWorkTim, _equipment, _theWeight, _color);
        this._drive = _drive;
    }

    //methods
    @Override
    public void print() {
        System.out.printf("%-20s|%-50s","LAPTOP","CLASS_BUDGET");
        System.out.printf("\n--------------------|------------\n");
        System.out.printf("%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n" +
                        "%-20s|%-40s\n%-20s|%-40.1f\n%-20s|%-40s\n%-20s|%-40s\n" +
                        "%-20s|%-40s\n" +
                        "%-20s|%-40d\n%-20s|%-40s\n%-20s|%-40d\n" +
                        "%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40d\n" +
                        "%-20s|%-40s\n%-20s|%-40s\n" +
                        "%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40s\n%-20s|%-40d\n%-20s|%-40d\n%-20s|%-40s\n" +
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
                "DISK_DRIVE", get_drive(),
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
    public String get_drive() {
        return _drive;
    }

    public void set_drive(String _drive) {
        this._drive = _drive;
    }
}

package com.company;

public abstract class Laptop{
    //attributes
    //MAIN CHARACTERISTICS
    private String _brand; //Бренд ноутбука
    private String _model; //Модель ноутбука
    private String _OS_name; //Имя Оперционной Системы
    private String _countryOfOrigin; //Страна производителя
    private String _manufacturer; //Производитель
    //DISPLAY
    private String _screenType; //Тип Экрана
    private double _diagonal; //Диагональ экрана (в дюймах)
    private String _screenResolution; //Разрешение экрана (в пикселях)
    private String _screenFrequency; //Частота экрана (Hz в герцах)
    //CPU
    private String _modelCPU; //Модель процессора
    //MEMORY
    private int _RAM_size; // Размер опреративной памяти (GB)
    private String _hardDiskType; //Тип жесткого диска (SSD or HDD)
    private int _driveVolume; //Объём жесткого диска
    //VIDEO CARD
    private String _videoAdapter; //Видеоадаптер
    private String _graphicsCardType; //Тип видеокарты
    private int vVideoAdapterMemory; //Объём памяти видеоадаптера
    //CONNECTORS AND INTERFACES
    private String _interfaces; //Интерфейсы
    private String _wirelessConnection; //Беспроводная связь
    //ADDITIONAL INFORMATION
    private String _ultrabook; //да или нет?
    private String _webCamera; //есть или нет?
    private String _microphone; //)микрофон
    private String _builtInSpeakers; //динамики встароены?
    private int _batteryCapacity; //объёйм энергий (в mАч)
    private int _continuousWorkTim; //время в непрерывной работы(в часах)
    private String _equipment; //Комплектация+
    //DIMENSIONS, WEIGHT
    private double _theWeight; //Вес
    private ColorNewLaprtom _color; //Цвет ноутбука

    //constructors-
    public Laptop() {}

    public Laptop(String _brand, String _model, String _OS_name, String _countryOfOrigin, String _manufacturer, String _screenType, double _diagonal, String _screenResolution, String _screenFrequency, String _modelCPU, int _RAM_size, String _hardDiskType, int _driveVolume, String _videoAdapter, String _graphicsCardType, int vVideoAdapterMemory, String _interfaces, String _wirelessConnection, String _ultrabook, String _webCamera, String _microphone, String _builtInSpeakers, int _batteryCapacity, int _continuousWorkTim, String _equipment, double _theWeight, ColorNewLaprtom _color) {
        this._brand = _brand;
        this._model = _model;
        this._OS_name = _OS_name;
        this._countryOfOrigin = _countryOfOrigin;
        this._manufacturer = _manufacturer;
        this._screenType = _screenType;
        this._diagonal = _diagonal;
        this._screenResolution = _screenResolution;
        this._screenFrequency = _screenFrequency;
        this._modelCPU = _modelCPU;
        this._RAM_size = _RAM_size;
        this._hardDiskType = _hardDiskType;
        this._driveVolume = _driveVolume;
        this._videoAdapter = _videoAdapter;
        this._graphicsCardType = _graphicsCardType;
        this.vVideoAdapterMemory = vVideoAdapterMemory;
        this._interfaces = _interfaces;
        this._wirelessConnection = _wirelessConnection;
        this._ultrabook = _ultrabook;
        this._webCamera = _webCamera;
        this._microphone = _microphone;
        this._builtInSpeakers = _builtInSpeakers;
        this._batteryCapacity = _batteryCapacity;
        this._continuousWorkTim = _continuousWorkTim;
        this._equipment = _equipment;
        this._theWeight = _theWeight;
        this._color = _color;
    }
    //methods

    //getters or setters

    public String get_brand() {
        return _brand;
    }

    public void set_brand(String _brand) {
        this._brand = _brand;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public String get_OS_name() {
        return _OS_name;
    }

    public void set_OS_name(String _OS_name) {
        this._OS_name = _OS_name;
    }

    public String get_countryOfOrigin() {
        return _countryOfOrigin;
    }

    public void set_countryOfOrigin(String _countryOfOrigin) {
        this._countryOfOrigin = _countryOfOrigin;
    }

    public String get_manufacturer() {
        return _manufacturer;
    }

    public void set_manufacturer(String _manufacturer) {
        this._manufacturer = _manufacturer;
    }

    public String get_screenType() {
        return _screenType;
    }

    public void set_screenType(String _screenType) {
        this._screenType = _screenType;
    }

    public double get_diagonal() {
        return _diagonal;
    }

    public void set_diagonal(double _diagonal) {
        this._diagonal = _diagonal;
    }

    public String get_screenResolution() {
        return _screenResolution;
    }

    public void set_screenResolution(String _screenResolution) {
        this._screenResolution = _screenResolution;
    }

    public String get_screenFrequency() {
        return _screenFrequency;
    }

    public void set_screenFrequency(String _screenFrequency) {
        this._screenFrequency = _screenFrequency;
    }

    public String get_modelCPU() {
        return _modelCPU;
    }

    public void set_modelCPU(String _modelCPU) {
        this._modelCPU = _modelCPU;
    }

    public int get_RAM_size() {
        return _RAM_size;
    }

    public void set_RAM_size(int _RAM_size) {
        this._RAM_size = _RAM_size;
    }

    public String get_hardDiskType() {
        return _hardDiskType;
    }

    public void set_hardDiskType(String _hardDiskType) {
        this._hardDiskType = _hardDiskType;
    }

    public int get_driveVolume() {
        return _driveVolume;
    }

    public void set_driveVolume(int _driveVolume) {
        this._driveVolume = _driveVolume;
    }

    public String get_videoAdapter() {
        return _videoAdapter;
    }

    public void set_videoAdapter(String _videoAdapter) {
        this._videoAdapter = _videoAdapter;
    }

    public String get_graphicsCardType() {
        return _graphicsCardType;
    }

    public void set_graphicsCardType(String _graphicsCardType) {
        this._graphicsCardType = _graphicsCardType;
    }

    public int getvVideoAdapterMemory() {
        return vVideoAdapterMemory;
    }

    public void setvVideoAdapterMemory(int vVideoAdapterMemory) {
        this.vVideoAdapterMemory = vVideoAdapterMemory;
    }

    public String get_interfaces() {
        return _interfaces;
    }

    public void set_interfaces(String _interfaces) {
        this._interfaces = _interfaces;
    }

    public String get_wirelessConnection() {
        return _wirelessConnection;
    }

    public void set_wirelessConnection(String _wirelessConnection) {
        this._wirelessConnection = _wirelessConnection;
    }

    public String get_ultrabook() {
        return _ultrabook;
    }

    public void set_ultrabook(String _ultrabook) {
        this._ultrabook = _ultrabook;
    }

    public String get_webCamera() {
        return _webCamera;
    }

    public void set_webCamera(String _webCamera) {
        this._webCamera = _webCamera;
    }

    public String get_microphone() {
        return _microphone;
    }

    public void set_microphone(String _microphone) {
        this._microphone = _microphone;
    }

    public String get_builtInSpeakers() {
        return _builtInSpeakers;
    }

    public void set_builtInSpeakers(String _builtInSpeakers) {
        this._builtInSpeakers = _builtInSpeakers;
    }

    public int get_batteryCapacity() {
        return _batteryCapacity;
    }

    public void set_batteryCapacity(int _batteryCapacity) {
        this._batteryCapacity = _batteryCapacity;
    }

    public int get_continuousWorkTim() {
        return _continuousWorkTim;
    }

    public void set_continuousWorkTim(int _continuousWorkTim) {
        this._continuousWorkTim = _continuousWorkTim;
    }

    public String get_equipment() {
        return _equipment;
    }

    public void set_equipment(String _equipment) {
        this._equipment = _equipment;
    }

    public double get_theWeight() {
        return _theWeight;
    }

    public void set_theWeight(double _theWeight) {
        this._theWeight = _theWeight;
    }

    public ColorNewLaprtom get_color() {
        return _color;
    }

    public void set_color(ColorNewLaprtom _color) {
        this._color = _color;
    }
}

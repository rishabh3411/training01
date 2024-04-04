package components;

public class processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cachememory;
    private String frequency;
    private String minfrequency;
    private String maxfrequency;

    public processor() {
        brand = "intel";
        series = "11000u";
        generation = 11;
        cores = 4;
        threads = 4;
        cachememory = "5 mb";
        frequency = "2.5 ghz";
        minfrequency = "2.4 ghz";
        maxfrequency = "3.1 ghz";
    }

    public processor(String brand, String series, int generation, int cores, int threads, String cachememory, String frequency, String minfrequency, String maxfrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cachememory = cachememory;
        this.frequency = frequency;
        this.minfrequency = minfrequency;
        this.maxfrequency = maxfrequency;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public String getCachememory() {
        return cachememory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinfrequency() {
        return minfrequency;
    }

    public String getMaxfrequency() {
        return maxfrequency;
    }

    @Override
    public String toString() {
        return "processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", cores=" + cores +
                ", threads=" + threads +
                ", cachememory='" + cachememory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", minfrequency='" + minfrequency + '\'' +
                ", maxfrequency='" + maxfrequency + '\'' +
                '}';
    }
}

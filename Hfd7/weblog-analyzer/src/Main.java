public class Main {

    public static void main(String[] args) {
//        LogfileCreator logfileCreator = new LogfileCreator();
//        logfileCreator.createFile("test.txt",30);
        LogAnalyzer logAnalyzer = new LogAnalyzer("weblog.txt");

        logAnalyzer.analyzeHourlyData();
        logAnalyzer.printHourlyCounts();
    }
}

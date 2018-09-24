import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LogfileCreator logfileCreator = new LogfileCreator();
        logfileCreator.createFile("src/test.txt",24);
        LogAnalyzer logAnalyzer = new LogAnalyzer("weblog.txt");

        logAnalyzer.analyzeHourlyData();
        logAnalyzer.printHourlyCounts();
        System.out.println(logAnalyzer.numberOfAccesses());
        System.out.println(logAnalyzer.busiestHour());
        System.out.println(logAnalyzer.quitestHour());
        System.out.println(logAnalyzer.twoBusiestHour());
    }
}

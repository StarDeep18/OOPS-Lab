import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Attendance {
    private String studentName;
    private String ipAddress;
    private String loginTime;

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setIpAddress(String ip) {
        this.ipAddress = ip;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setLoginTime(String time) {
        this.loginTime = time;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public String getFormattedRecord() {
        return "Name: " + studentName + ", IP: " + ipAddress + ", Login Time: " + loginTime + "\n";
    }
}

public class Package2 {
    public static void main(String[] args) {
        Attendance a = new Attendance();
        a.setStudentName("Rahul Sharma");

        try {
            InetAddress inet = InetAddress.getLocalHost();
            a.setIpAddress(inet.getHostAddress());

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            a.setLoginTime(dtf.format(now));

            FileWriter writer = new FileWriter("attendance_log.txt", true);
            writer.write(a.getFormattedRecord());
            writer.close();

            System.out.println("Attendance logged successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

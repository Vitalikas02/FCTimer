import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeMath {
    static int cooldownDungeonHours = 168;
    static String rollbackStr;
    public static LocalDateTime nowDateTimePerClick = LocalDateTime.now();
    public static LocalDateTime ROLLBACK = nowDateTimePerClick.plusHours(cooldownDungeonHours);


    void timeMath() throws IOException {
        nowDateTimePerClick = LocalDateTime.now();
        Period period = Period.between(nowDateTimePerClick.toLocalDate(), ROLLBACK.toLocalDate());
        period = period.minusDays(ROLLBACK.toLocalTime().compareTo(nowDateTimePerClick.toLocalTime()) >= 0 ? 0 : 1);

        Duration duration = Duration.between(nowDateTimePerClick, ROLLBACK);
        duration = duration.minusDays(duration.toDays());

        System.out.printf(
                "[LOG] До отката: " + "%d лет, %d месяцев, %d дней, %d часов, %d минут, %d секунд." + "\n",
                period.getYears(), period.getMonths(), period.getDays(),
                duration.toHours(), duration.toMinutes(), duration.toSeconds());


        rollbackStr = String.format("%d дней " + "%d" + ":" + "%d" + ":" + "%d" + "\n",
                period.getDays(), duration.toHours(), duration.toMinutes(), duration.toSeconds());

        new JsonManager().jsonManager();
    }

    public static LocalDateTime getROLLBACK() { return ROLLBACK; }
}

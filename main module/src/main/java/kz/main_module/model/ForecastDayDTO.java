package kz.main_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForecastDayDTO {
    private String date;
    private DailyDTO day;
    private AstroDTO astro;
    private List<HourlyDTO> hour;
}

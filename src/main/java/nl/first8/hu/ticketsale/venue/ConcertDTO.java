package nl.first8.hu.ticketsale.venue;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

/**
 * Created by arko1 on 11/06/2017.
 */
@Data
@AllArgsConstructor
public class ConcertDTO {
    private long id;
    private String locationName;
    private String artistName;
    private Ganre artistGenre;
    private Date concertDate;
}

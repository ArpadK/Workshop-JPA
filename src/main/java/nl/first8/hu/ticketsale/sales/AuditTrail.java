package nl.first8.hu.ticketsale.sales;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by arko1 on 10/06/2017.
 */
@Entity
@Data
@NoArgsConstructor
public class AuditTrail implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private long saleId;

    private long accountId;
}

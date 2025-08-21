package packRaiz.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@EqualsAndHashCode
@ToString
@Getter

public class Money {

    private final list <MoneyAudit> history = new ArrayList<>();

    public Money(final MoneyAudit history) {
        this.history.add(history);
    }
    
    public void addAudit(final MoneyAudit history) {
        this.history.add(history);
    }
}

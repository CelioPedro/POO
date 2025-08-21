package packRaiz.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public record MoneyAudit(
    UUID transactionId,
    BankService targetService0
    String description,
    OffsetDateTime createdAt)
    {
    
}

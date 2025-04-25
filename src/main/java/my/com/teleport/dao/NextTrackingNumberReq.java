package my.com.teleport.dao;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;
import my.com.teleport.annotation.CountryCode;
import my.com.teleport.annotation.DecimalPlaces;

import java.math.BigDecimal;

@Data
@ToString
public class NextTrackingNumberReq {
    @CountryCode
    @NotEmpty(message = "Origin country ID cannot be empty")
    @NotNull(message = "Origin country ID is required")
    public String origin_country_id;

    @CountryCode
    @NotEmpty(message = "Destination country ID cannot be empty")
    @NotNull(message = "Destination country ID is required")
    public String destination_country_id;

    @DecimalPlaces(value = 3, message = "Only 3 decimal places are allowed")
    @NotNull(message = "Weight is required")
    public BigDecimal weight;

    @NotEmpty(message = "Created date cannot be empty")
    @NotNull(message = "Created date is required")
    public String created_at;

    @NotEmpty(message = "Customer Id cannot be empty")
    @NotNull(message = "Customer Id is required")
    public String customer_id;

    @NotEmpty(message = "Customer name cannot be empty")
    @NotNull(message = "Customer name is required")
    public String customer_name;

}

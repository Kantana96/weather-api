package kz.demo.integration_module.model.errors;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomFeignException extends RuntimeException {
    private final ErrorDTO errorDTO;

    public CustomFeignException(ErrorDTO errorDTO) {
        super(errorDTO.getError().getMessage());
        this.errorDTO = errorDTO;
    }

}

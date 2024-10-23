package lazyprogrammer.jwtdemo.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lazyprogrammer.jwtdemo.entities.Branch;
import lazyprogrammer.jwtdemo.entities.Institution;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenUser {
    private long id;

    private String username;

    private Branch branch;

    private String emailAddress;

    private Institution institution;

    private String systemIP;


    public Boolean getIsSuperAdmin() {

        if (institution == null) return true;

        return institution.isISW();

    }
}

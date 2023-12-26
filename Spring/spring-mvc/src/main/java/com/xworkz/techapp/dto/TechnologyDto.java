package com.xworkz.techapp.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@NamedQueries({
        @NamedQuery(name = "getAll",query = "from TechnologyDto dto"),
        @NamedQuery(name = "getTechById",query = "from TechnologyDto dto where dto.id=:id")
})
public class TechnologyDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Tech Name cannot be null")
    @Size(max = 10,min = 2,message = "Tech Name must be between 2 and 10 characters")
    private String technologyName;
    @NotNull(message = "Tech version cannot be null")
    @Size(max = 5,min = 1,message = "Tech Name must be between 1 and 5 characters")
    private String version;
    @NotNull(message = "Tech owner cannot be null")
    @Size(max = 8,min = 2,message = "Tech owner must be between 2 and 8 characters")
    private String ownedOrganization;
    @NotNull(message = "Tech released year cannot be null")
    @Size(max = 4,min = 2,message = "Tech released year must be between 2 and 4 characters")
    private String releasedYear;
}

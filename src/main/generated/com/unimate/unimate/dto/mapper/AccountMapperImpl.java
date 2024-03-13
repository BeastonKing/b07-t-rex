package com.unimate.unimate.dto.mapper;

import com.unimate.unimate.dto.CleanAccountDTO;
import com.unimate.unimate.entity.Account;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-13T11:31:57+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public CleanAccountDTO accountToCleanAccountDTO(Account account) {
        if ( account == null ) {
            return null;
        }

        CleanAccountDTO cleanAccountDTO = new CleanAccountDTO();

        cleanAccountDTO.setId( account.getId() );
        cleanAccountDTO.setEmail( account.getEmail() );
        cleanAccountDTO.setName( account.getName() );
        cleanAccountDTO.setProfilePicture( account.getProfilePicture() );
        cleanAccountDTO.setRole( account.getRole() );
        cleanAccountDTO.setStatus( account.getStatus() );
        cleanAccountDTO.setCreatedAt( account.getCreatedAt() );
        cleanAccountDTO.setModifiedAt( account.getModifiedAt() );
        cleanAccountDTO.setDeletedAt( account.getDeletedAt() );

        return cleanAccountDTO;
    }
}

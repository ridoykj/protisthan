package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProspectDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProspectDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String companyName,
        String customerGroup,
        String noOfEmployees,
        BigDecimal annualRevenue,
        String marketSegment,
        String industry,
        String territory,
        String prospectOwner,
        String website,
        String fax,
        String company,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProspectDto fromEntity(ProspectDao eProspectDao) {
        return new ProspectDto(
                eProspectDao.getName(),
                eProspectDao.getCreation(),
                eProspectDao.getModified(),
                eProspectDao.getModifiedBy(),
                eProspectDao.getOwner(),
                eProspectDao.getIsDocStatus(),
                eProspectDao.getIdx(),
                eProspectDao.getCompanyName(),
                eProspectDao.getCustomerGroup(),
                eProspectDao.getNoOfEmployees(),
                eProspectDao.getAnnualRevenue(),
                eProspectDao.getMarketSegment(),
                eProspectDao.getIndustry(),
                eProspectDao.getTerritory(),
                eProspectDao.getProspectOwner(),
                eProspectDao.getWebsite(),
                eProspectDao.getFax(),
                eProspectDao.getCompany(),
                eProspectDao.getUserTags(),
                eProspectDao.getComments(),
                eProspectDao.getAssign(),
                eProspectDao.getLikedBy());
    }

    public static void fromDTO(ProspectDto vProspectDto, ProspectDao eProspectDao) {
        eProspectDao.setName(vProspectDto.name());
        eProspectDao.setCreation(vProspectDto.creation());
        eProspectDao.setModified(vProspectDto.modified());
        eProspectDao.setModifiedBy(vProspectDto.modifiedBy());
        eProspectDao.setOwner(vProspectDto.owner());
        eProspectDao.setIsDocStatus(vProspectDto.isDocStatus());
        eProspectDao.setIdx(vProspectDto.idx());
        eProspectDao.setCompanyName(vProspectDto.companyName());
        eProspectDao.setCustomerGroup(vProspectDto.customerGroup());
        eProspectDao.setNoOfEmployees(vProspectDto.noOfEmployees());
        eProspectDao.setAnnualRevenue(vProspectDto.annualRevenue());
        eProspectDao.setMarketSegment(vProspectDto.marketSegment());
        eProspectDao.setIndustry(vProspectDto.industry());
        eProspectDao.setTerritory(vProspectDto.territory());
        eProspectDao.setProspectOwner(vProspectDto.prospectOwner());
        eProspectDao.setWebsite(vProspectDto.website());
        eProspectDao.setFax(vProspectDto.fax());
        eProspectDao.setCompany(vProspectDto.company());
        eProspectDao.setUserTags(vProspectDto.userTags());
        eProspectDao.setComments(vProspectDto.comments());
        eProspectDao.setAssign(vProspectDto.assign());
        eProspectDao.setLikedBy(vProspectDto.likedBy());
    }
}
package com.itbd.application.db.dto;

import com.itbd.application.db.dao.NetworkPrinterSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NetworkPrinterSettingsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String serverIp,
        Integer port,
        String printerName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static NetworkPrinterSettingsDto fromEntity(NetworkPrinterSettingsDao eNetworkPrinterSettingsDao) {
        return new NetworkPrinterSettingsDto(
                eNetworkPrinterSettingsDao.getName(),
                eNetworkPrinterSettingsDao.getCreation(),
                eNetworkPrinterSettingsDao.getModified(),
                eNetworkPrinterSettingsDao.getModifiedBy(),
                eNetworkPrinterSettingsDao.getOwner(),
                eNetworkPrinterSettingsDao.getIsDocStatus(),
                eNetworkPrinterSettingsDao.getIdx(),
                eNetworkPrinterSettingsDao.getServerIp(),
                eNetworkPrinterSettingsDao.getPort(),
                eNetworkPrinterSettingsDao.getPrinterName(),
                eNetworkPrinterSettingsDao.getUserTags(),
                eNetworkPrinterSettingsDao.getComments(),
                eNetworkPrinterSettingsDao.getAssign(),
                eNetworkPrinterSettingsDao.getLikedBy());
    }

    public static void fromDTO(NetworkPrinterSettingsDto vNetworkPrinterSettingsDto, NetworkPrinterSettingsDao eNetworkPrinterSettingsDao) {
        eNetworkPrinterSettingsDao.setName(vNetworkPrinterSettingsDto.name());
        eNetworkPrinterSettingsDao.setCreation(vNetworkPrinterSettingsDto.creation());
        eNetworkPrinterSettingsDao.setModified(vNetworkPrinterSettingsDto.modified());
        eNetworkPrinterSettingsDao.setModifiedBy(vNetworkPrinterSettingsDto.modifiedBy());
        eNetworkPrinterSettingsDao.setOwner(vNetworkPrinterSettingsDto.owner());
        eNetworkPrinterSettingsDao.setIsDocStatus(vNetworkPrinterSettingsDto.isDocStatus());
        eNetworkPrinterSettingsDao.setIdx(vNetworkPrinterSettingsDto.idx());
        eNetworkPrinterSettingsDao.setServerIp(vNetworkPrinterSettingsDto.serverIp());
        eNetworkPrinterSettingsDao.setPort(vNetworkPrinterSettingsDto.port());
        eNetworkPrinterSettingsDao.setPrinterName(vNetworkPrinterSettingsDto.printerName());
        eNetworkPrinterSettingsDao.setUserTags(vNetworkPrinterSettingsDto.userTags());
        eNetworkPrinterSettingsDao.setComments(vNetworkPrinterSettingsDto.comments());
        eNetworkPrinterSettingsDao.setAssign(vNetworkPrinterSettingsDto.assign());
        eNetworkPrinterSettingsDao.setLikedBy(vNetworkPrinterSettingsDto.likedBy());
    }
}
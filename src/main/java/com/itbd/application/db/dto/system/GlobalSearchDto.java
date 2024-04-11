package com.itbd.application.db.dto.system;

import com.itbd.application.db.dao.system.GlobalSearchDao;
import jakarta.persistence.Id;

public record GlobalSearchDto(
        @Id

        String docType,
        String name,
        String title,
        String content,
        String route,
        Boolean published
) {
    public static GlobalSearchDto fromEntity(GlobalSearchDao eGlobalSearchDao) {
        return new GlobalSearchDto(
                eGlobalSearchDao.getDocType(),
                eGlobalSearchDao.getName(),
                eGlobalSearchDao.getTitle(),
                eGlobalSearchDao.getContent(),
                eGlobalSearchDao.getRoute(),
                eGlobalSearchDao.getPublished());
    }

    public static void fromDTO(GlobalSearchDto vGlobalSearchDto, GlobalSearchDao eGlobalSearchDao) {
        eGlobalSearchDao.setDocType(vGlobalSearchDto.docType());
        eGlobalSearchDao.setName(vGlobalSearchDto.name());
        eGlobalSearchDao.setTitle(vGlobalSearchDto.title());
        eGlobalSearchDao.setContent(vGlobalSearchDto.content());
        eGlobalSearchDao.setRoute(vGlobalSearchDto.route());
        eGlobalSearchDao.setPublished(vGlobalSearchDto.published());
    }
}
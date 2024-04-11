package com.itbd.application.db.dto.print;

import com.itbd.application.db.dao.print.PrintFormatFieldTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PrintFormatFieldTemplateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String field,
        String templateFile,
        String module,
        Boolean standard,
        String template,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PrintFormatFieldTemplateDto fromEntity(PrintFormatFieldTemplateDao ePrintFormatFieldTemplateDao) {
        return new PrintFormatFieldTemplateDto(
                ePrintFormatFieldTemplateDao.getName(),
                ePrintFormatFieldTemplateDao.getCreation(),
                ePrintFormatFieldTemplateDao.getModified(),
                ePrintFormatFieldTemplateDao.getModifiedBy(),
                ePrintFormatFieldTemplateDao.getOwner(),
                ePrintFormatFieldTemplateDao.getIsDocStatus(),
                ePrintFormatFieldTemplateDao.getIdx(),
                ePrintFormatFieldTemplateDao.getDocumentType(),
                ePrintFormatFieldTemplateDao.getField(),
                ePrintFormatFieldTemplateDao.getTemplateFile(),
                ePrintFormatFieldTemplateDao.getModule(),
                ePrintFormatFieldTemplateDao.getStandard(),
                ePrintFormatFieldTemplateDao.getTemplate(),
                ePrintFormatFieldTemplateDao.getUserTags(),
                ePrintFormatFieldTemplateDao.getComments(),
                ePrintFormatFieldTemplateDao.getAssign(),
                ePrintFormatFieldTemplateDao.getLikedBy());
    }

    public static void fromDTO(PrintFormatFieldTemplateDto vPrintFormatFieldTemplateDto, PrintFormatFieldTemplateDao ePrintFormatFieldTemplateDao) {
        ePrintFormatFieldTemplateDao.setName(vPrintFormatFieldTemplateDto.name());
        ePrintFormatFieldTemplateDao.setCreation(vPrintFormatFieldTemplateDto.creation());
        ePrintFormatFieldTemplateDao.setModified(vPrintFormatFieldTemplateDto.modified());
        ePrintFormatFieldTemplateDao.setModifiedBy(vPrintFormatFieldTemplateDto.modifiedBy());
        ePrintFormatFieldTemplateDao.setOwner(vPrintFormatFieldTemplateDto.owner());
        ePrintFormatFieldTemplateDao.setIsDocStatus(vPrintFormatFieldTemplateDto.isDocStatus());
        ePrintFormatFieldTemplateDao.setIdx(vPrintFormatFieldTemplateDto.idx());
        ePrintFormatFieldTemplateDao.setDocumentType(vPrintFormatFieldTemplateDto.documentType());
        ePrintFormatFieldTemplateDao.setField(vPrintFormatFieldTemplateDto.field());
        ePrintFormatFieldTemplateDao.setTemplateFile(vPrintFormatFieldTemplateDto.templateFile());
        ePrintFormatFieldTemplateDao.setModule(vPrintFormatFieldTemplateDto.module());
        ePrintFormatFieldTemplateDao.setStandard(vPrintFormatFieldTemplateDto.standard());
        ePrintFormatFieldTemplateDao.setTemplate(vPrintFormatFieldTemplateDto.template());
        ePrintFormatFieldTemplateDao.setUserTags(vPrintFormatFieldTemplateDto.userTags());
        ePrintFormatFieldTemplateDao.setComments(vPrintFormatFieldTemplateDto.comments());
        ePrintFormatFieldTemplateDao.setAssign(vPrintFormatFieldTemplateDto.assign());
        ePrintFormatFieldTemplateDao.setLikedBy(vPrintFormatFieldTemplateDto.likedBy());
    }
}
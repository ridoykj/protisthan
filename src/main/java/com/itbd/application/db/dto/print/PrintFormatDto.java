package com.itbd.application.db.dto.print;

import com.itbd.application.db.dao.printing.PrintFormatDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PrintFormatDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String docType,
        String module,
        String defaultPrintLanguage,
        String standard,
        Boolean customFormat,
        Boolean disabled,
        String printFormatType,
        Boolean rawPrinting,
        String html,
        String rawCommands,
        BigDecimal marginTop,
        BigDecimal marginBottom,
        BigDecimal marginLeft,
        BigDecimal marginRight,
        Boolean alignLabelsRight,
        Boolean showSectionHeadings,
        Boolean lineBreaks,
        Boolean absoluteValue,
        Integer fontSize,
        String font,
        String pageNumber,
        String css,
        String formatData,
        Boolean printFormatBuilder,
        Boolean printFormatBuilderBeta,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PrintFormatDto fromEntity(PrintFormatDao ePrintFormatDao) {
        return new PrintFormatDto(
                ePrintFormatDao.getName(),
                ePrintFormatDao.getCreation(),
                ePrintFormatDao.getModified(),
                ePrintFormatDao.getModifiedBy(),
                ePrintFormatDao.getOwner(),
                ePrintFormatDao.getIsDocStatus(),
                ePrintFormatDao.getIdx(),
                ePrintFormatDao.getDocType(),
                ePrintFormatDao.getModule(),
                ePrintFormatDao.getDefaultPrintLanguage(),
                ePrintFormatDao.getStandard(),
                ePrintFormatDao.getCustomFormat(),
                ePrintFormatDao.getDisabled(),
                ePrintFormatDao.getPrintFormatType(),
                ePrintFormatDao.getRawPrinting(),
                ePrintFormatDao.getHtml(),
                ePrintFormatDao.getRawCommands(),
                ePrintFormatDao.getMarginTop(),
                ePrintFormatDao.getMarginBottom(),
                ePrintFormatDao.getMarginLeft(),
                ePrintFormatDao.getMarginRight(),
                ePrintFormatDao.getAlignLabelsRight(),
                ePrintFormatDao.getShowSectionHeadings(),
                ePrintFormatDao.getLineBreaks(),
                ePrintFormatDao.getAbsoluteValue(),
                ePrintFormatDao.getFontSize(),
                ePrintFormatDao.getFont(),
                ePrintFormatDao.getPageNumber(),
                ePrintFormatDao.getCss(),
                ePrintFormatDao.getFormatData(),
                ePrintFormatDao.getPrintFormatBuilder(),
                ePrintFormatDao.getPrintFormatBuilderBeta(),
                ePrintFormatDao.getUserTags(),
                ePrintFormatDao.getComments(),
                ePrintFormatDao.getAssign(),
                ePrintFormatDao.getLikedBy());
    }

    public static void fromDTO(PrintFormatDto vPrintFormatDto, PrintFormatDao ePrintFormatDao) {
        ePrintFormatDao.setName(vPrintFormatDto.name());
        ePrintFormatDao.setCreation(vPrintFormatDto.creation());
        ePrintFormatDao.setModified(vPrintFormatDto.modified());
        ePrintFormatDao.setModifiedBy(vPrintFormatDto.modifiedBy());
        ePrintFormatDao.setOwner(vPrintFormatDto.owner());
        ePrintFormatDao.setIsDocStatus(vPrintFormatDto.isDocStatus());
        ePrintFormatDao.setIdx(vPrintFormatDto.idx());
        ePrintFormatDao.setDocType(vPrintFormatDto.docType());
        ePrintFormatDao.setModule(vPrintFormatDto.module());
        ePrintFormatDao.setDefaultPrintLanguage(vPrintFormatDto.defaultPrintLanguage());
        ePrintFormatDao.setStandard(vPrintFormatDto.standard());
        ePrintFormatDao.setCustomFormat(vPrintFormatDto.customFormat());
        ePrintFormatDao.setDisabled(vPrintFormatDto.disabled());
        ePrintFormatDao.setPrintFormatType(vPrintFormatDto.printFormatType());
        ePrintFormatDao.setRawPrinting(vPrintFormatDto.rawPrinting());
        ePrintFormatDao.setHtml(vPrintFormatDto.html());
        ePrintFormatDao.setRawCommands(vPrintFormatDto.rawCommands());
        ePrintFormatDao.setMarginTop(vPrintFormatDto.marginTop());
        ePrintFormatDao.setMarginBottom(vPrintFormatDto.marginBottom());
        ePrintFormatDao.setMarginLeft(vPrintFormatDto.marginLeft());
        ePrintFormatDao.setMarginRight(vPrintFormatDto.marginRight());
        ePrintFormatDao.setAlignLabelsRight(vPrintFormatDto.alignLabelsRight());
        ePrintFormatDao.setShowSectionHeadings(vPrintFormatDto.showSectionHeadings());
        ePrintFormatDao.setLineBreaks(vPrintFormatDto.lineBreaks());
        ePrintFormatDao.setAbsoluteValue(vPrintFormatDto.absoluteValue());
        ePrintFormatDao.setFontSize(vPrintFormatDto.fontSize());
        ePrintFormatDao.setFont(vPrintFormatDto.font());
        ePrintFormatDao.setPageNumber(vPrintFormatDto.pageNumber());
        ePrintFormatDao.setCss(vPrintFormatDto.css());
        ePrintFormatDao.setFormatData(vPrintFormatDto.formatData());
        ePrintFormatDao.setPrintFormatBuilder(vPrintFormatDto.printFormatBuilder());
        ePrintFormatDao.setPrintFormatBuilderBeta(vPrintFormatDto.printFormatBuilderBeta());
        ePrintFormatDao.setUserTags(vPrintFormatDto.userTags());
        ePrintFormatDao.setComments(vPrintFormatDto.comments());
        ePrintFormatDao.setAssign(vPrintFormatDto.assign());
        ePrintFormatDao.setLikedBy(vPrintFormatDto.likedBy());
    }
}
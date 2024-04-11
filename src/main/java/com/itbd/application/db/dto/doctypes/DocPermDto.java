package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.doctypes.DocPermDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocPermDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        String parent,
        String parentField,
        String parentType,
        Integer idx,
        Integer permLevel,
        String role,
        String match,
        Boolean read,
        Boolean write,
        Boolean create,
        Boolean submit,
        Boolean cancel,
        Boolean delete,
        Boolean amend,
        Boolean report,
        Boolean export,
        Boolean imports,
        Boolean share,
        Boolean print,
        Boolean email,
        Boolean ifOwner,
        Boolean select
) {
    public static DocPermDto fromEntity(DocPermDao eDocPermDao) {
        return new DocPermDto(
                eDocPermDao.getName(),
                eDocPermDao.getCreation(),
                eDocPermDao.getModified(),
                eDocPermDao.getModifiedBy(),
                eDocPermDao.getOwner(),
                eDocPermDao.getIsDocStatus(),
                eDocPermDao.getParent(),
                eDocPermDao.getParentField(),
                eDocPermDao.getParentType(),
                eDocPermDao.getIdx(),
                eDocPermDao.getPermLevel(),
                eDocPermDao.getRole(),
                eDocPermDao.getMatch(),
                eDocPermDao.getRead(),
                eDocPermDao.getWrite(),
                eDocPermDao.getCreate(),
                eDocPermDao.getSubmit(),
                eDocPermDao.getCancel(),
                eDocPermDao.getDelete(),
                eDocPermDao.getAmend(),
                eDocPermDao.getReport(),
                eDocPermDao.getExport(),
                eDocPermDao.getImports(),
                eDocPermDao.getShare(),
                eDocPermDao.getPrint(),
                eDocPermDao.getEmail(),
                eDocPermDao.getIfOwner(),
                eDocPermDao.getSelect());
    }

    public static void fromDTO(DocPermDto vDocPermDto, DocPermDao eDocPermDao) {
        eDocPermDao.setName(vDocPermDto.name());
        eDocPermDao.setCreation(vDocPermDto.creation());
        eDocPermDao.setModified(vDocPermDto.modified());
        eDocPermDao.setModifiedBy(vDocPermDto.modifiedBy());
        eDocPermDao.setOwner(vDocPermDto.owner());
        eDocPermDao.setIsDocStatus(vDocPermDto.isDocStatus());
        eDocPermDao.setParent(vDocPermDto.parent());
        eDocPermDao.setParentField(vDocPermDto.parentField());
        eDocPermDao.setParentType(vDocPermDto.parentType());
        eDocPermDao.setIdx(vDocPermDto.idx());
        eDocPermDao.setPermLevel(vDocPermDto.permLevel());
        eDocPermDao.setRole(vDocPermDto.role());
        eDocPermDao.setMatch(vDocPermDto.match());
        eDocPermDao.setRead(vDocPermDto.read());
        eDocPermDao.setWrite(vDocPermDto.write());
        eDocPermDao.setCreate(vDocPermDto.create());
        eDocPermDao.setSubmit(vDocPermDto.submit());
        eDocPermDao.setCancel(vDocPermDto.cancel());
        eDocPermDao.setDelete(vDocPermDto.delete());
        eDocPermDao.setAmend(vDocPermDto.amend());
        eDocPermDao.setReport(vDocPermDto.report());
        eDocPermDao.setExport(vDocPermDto.export());
        eDocPermDao.setImports(vDocPermDto.imports());
        eDocPermDao.setShare(vDocPermDto.share());
        eDocPermDao.setPrint(vDocPermDto.print());
        eDocPermDao.setEmail(vDocPermDto.email());
        eDocPermDao.setIfOwner(vDocPermDto.ifOwner());
        eDocPermDao.setSelect(vDocPermDto.select());
    }
}
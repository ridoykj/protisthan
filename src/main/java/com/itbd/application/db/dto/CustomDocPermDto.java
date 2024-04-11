package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CustomDocPermDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomDocPermDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String parent,
        String role,
        Boolean ifOwner,
        Integer permLevel,
        Boolean select,
        Boolean read,
        Boolean write,
        Boolean create,
        Boolean delete,
        Boolean submit,
        Boolean cancel,
        Boolean amend,
        Boolean report,
        Boolean export,
        Boolean imports,
        Boolean share,
        Boolean print,
        Boolean email,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CustomDocPermDto fromEntity(CustomDocPermDao eCustomDocPermDao) {
        return new CustomDocPermDto(
                eCustomDocPermDao.getName(),
                eCustomDocPermDao.getCreation(),
                eCustomDocPermDao.getModified(),
                eCustomDocPermDao.getModifiedBy(),
                eCustomDocPermDao.getOwner(),
                eCustomDocPermDao.getIsDocStatus(),
                eCustomDocPermDao.getIdx(),
                eCustomDocPermDao.getParent(),
                eCustomDocPermDao.getRole(),
                eCustomDocPermDao.getIfOwner(),
                eCustomDocPermDao.getPermLevel(),
                eCustomDocPermDao.getSelect(),
                eCustomDocPermDao.getRead(),
                eCustomDocPermDao.getWrite(),
                eCustomDocPermDao.getCreate(),
                eCustomDocPermDao.getDelete(),
                eCustomDocPermDao.getSubmit(),
                eCustomDocPermDao.getCancel(),
                eCustomDocPermDao.getAmend(),
                eCustomDocPermDao.getReport(),
                eCustomDocPermDao.getExport(),
                eCustomDocPermDao.getImports(),
                eCustomDocPermDao.getShare(),
                eCustomDocPermDao.getPrint(),
                eCustomDocPermDao.getEmail(),
                eCustomDocPermDao.getUserTags(),
                eCustomDocPermDao.getComments(),
                eCustomDocPermDao.getAssign(),
                eCustomDocPermDao.getLikedBy());
    }

    public static void fromDTO(CustomDocPermDto vCustomDocPermDto, CustomDocPermDao eCustomDocPermDao) {
        eCustomDocPermDao.setName(vCustomDocPermDto.name());
        eCustomDocPermDao.setCreation(vCustomDocPermDto.creation());
        eCustomDocPermDao.setModified(vCustomDocPermDto.modified());
        eCustomDocPermDao.setModifiedBy(vCustomDocPermDto.modifiedBy());
        eCustomDocPermDao.setOwner(vCustomDocPermDto.owner());
        eCustomDocPermDao.setIsDocStatus(vCustomDocPermDto.isDocStatus());
        eCustomDocPermDao.setIdx(vCustomDocPermDto.idx());
        eCustomDocPermDao.setParent(vCustomDocPermDto.parent());
        eCustomDocPermDao.setRole(vCustomDocPermDto.role());
        eCustomDocPermDao.setIfOwner(vCustomDocPermDto.ifOwner());
        eCustomDocPermDao.setPermLevel(vCustomDocPermDto.permLevel());
        eCustomDocPermDao.setSelect(vCustomDocPermDto.select());
        eCustomDocPermDao.setRead(vCustomDocPermDto.read());
        eCustomDocPermDao.setWrite(vCustomDocPermDto.write());
        eCustomDocPermDao.setCreate(vCustomDocPermDto.create());
        eCustomDocPermDao.setDelete(vCustomDocPermDto.delete());
        eCustomDocPermDao.setSubmit(vCustomDocPermDto.submit());
        eCustomDocPermDao.setCancel(vCustomDocPermDto.cancel());
        eCustomDocPermDao.setAmend(vCustomDocPermDto.amend());
        eCustomDocPermDao.setReport(vCustomDocPermDto.report());
        eCustomDocPermDao.setExport(vCustomDocPermDto.export());
        eCustomDocPermDao.setImports(vCustomDocPermDto.imports());
        eCustomDocPermDao.setShare(vCustomDocPermDto.share());
        eCustomDocPermDao.setPrint(vCustomDocPermDto.print());
        eCustomDocPermDao.setEmail(vCustomDocPermDto.email());
        eCustomDocPermDao.setUserTags(vCustomDocPermDto.userTags());
        eCustomDocPermDao.setComments(vCustomDocPermDto.comments());
        eCustomDocPermDao.setAssign(vCustomDocPermDto.assign());
        eCustomDocPermDao.setLikedBy(vCustomDocPermDto.likedBy());
    }
}
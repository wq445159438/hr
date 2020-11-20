create procedure add_s_ban(
    i_att_userid in number,
    i_att_late in number
)
is
begin
  lock table ATTENDANCE in share update mode;
    insert into ATTENDANCE(att_id, att_userid, att_s_ban, att_late)
        values (ATTENDANCE_ID.nextval,i_att_userid,sysdate,i_att_late);
end;
  /


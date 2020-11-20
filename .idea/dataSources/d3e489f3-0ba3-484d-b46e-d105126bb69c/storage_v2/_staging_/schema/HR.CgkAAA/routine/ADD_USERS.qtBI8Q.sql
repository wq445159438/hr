create procedure add_users(
  i_user in USEROBJECT
)
  is
begin
  insert into USERS(u_id, u_name, workid, sex, birthday, phone, address, dep_id, pos_id, s_ban, x_ban, u_remarks,
  identitycard, password, u_state) values (i_user.U_ID,i_user.U_NAME,i_user.WORKID,i_user.SEX,i_user.BIRTHDAY,
  i_user.PHONE,i_user.ADDRESS,i_user.DEP_ID,i_user.POS_ID,i_user.S_BAN,i_user.X_BAN,i_user.U_REMARKS,i_user.IDENTITYCARD,
  i_user.PASSWORDS,0);
end;
/


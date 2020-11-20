create procedure login1(
  workId1 in number,
  password1 in varchar2,
  o_name out varchar2
)
is
  begin
    lock table users in row share mode;
    select U_NAME into o_name from USERS where WORKID = WORKID1 and PASSWORD = password1;
  end;
/


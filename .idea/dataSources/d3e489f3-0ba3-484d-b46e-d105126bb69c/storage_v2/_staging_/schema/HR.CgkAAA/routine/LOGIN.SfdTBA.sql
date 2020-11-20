create procedure login(
  workId1   in number,
  password1 in varchar2
)
as
  u_name1 varchar2(50);
  begin
    select
           u_name
    into
      u_name1
    from USERS
    where WORKID = workId1
      and PASSWORD = password1;
  end;



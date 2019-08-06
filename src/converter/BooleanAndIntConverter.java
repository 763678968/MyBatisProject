package converter;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// BaseTypeHandler<java类型>
public class BooleanAndIntConverter extends BaseTypeHandler<Boolean> {

    // java(boolean) - DB(number)
    /**
     * @param ps: PreparedStatement对象
     * @param i: PreparedStatement对象操作参数的位置
     * @param parameter: java值
     * @param jdbcType: jdbc操作的数据库类型
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
        if (parameter) {
            // 1
            ps.setInt(i, 1);
        } else {
            // 0
            ps.setInt(i, 0);
        }
    }

    // db(number) -> java(boolean)
    @Override
    public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int sexNum = rs.getInt(columnName);
        return sexNum == 1;
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int sexNum = rs.getInt(columnIndex);
        return sexNum == 1;
    }

    @Override
    public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int sexNum = cs.getInt(columnIndex);
        return sexNum == 1;
    }
}

package Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public abstract class Checked {

    public abstract void SQLException() throws SQLException;

    public abstract void InterruptedException() throws InterruptedException;

    public abstract void IOExceptionAndChild() throws IOException;

    public abstract void EvenRuntimeException() throws RuntimeException;

}

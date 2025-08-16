/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\Lenovo\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\Lenovo\AppData\Local\Android\Sdk\platforms\android-35\framework.aidl -oD:\H\OBSI\SoloLeveling\Mobile\ Testing\Courses\hextree\6-\ Intent\ Attack\ Surface\CODE\App\ to\ get\ flags\app\build\generated\aidl_source_output_dir\debug\out -ID:\H\OBSI\SoloLeveling\Mobile\ Testing\Courses\hextree\6-\ Intent\ Attack\ Surface\CODE\App\ to\ get\ flags\app\src\main\aidl -ID:\H\OBSI\SoloLeveling\Mobile\ Testing\Courses\hextree\6-\ Intent\ Attack\ Surface\CODE\App\ to\ get\ flags\app\src\debug\aidl -IC:\Users\Lenovo\.gradle\caches\8.10.2\transforms\1b89a4ef0596eddf891071b8ad4b689b\transformed\core-1.13.0\aidl -IC:\Users\Lenovo\.gradle\caches\8.10.2\transforms\690530045e45a55919298a2fac694a47\transformed\versionedparcelable-1.1.1\aidl -dC:\Users\Lenovo\AppData\Local\Temp\aidl9398270525486681211.d D:\H\OBSI\SoloLeveling\Mobile\ Testing\Courses\hextree\6-\ Intent\ Attack\ Surface\CODE\App\ to\ get\ flags\app\src\main\aidl\io\hextree\attacksurface\services\IFlag29Interface.aidl
 */
package io.hextree.attacksurface.services;
// Declare any non-default types here with import statements
public interface IFlag29Interface extends android.os.IInterface
{
  /** Default implementation for IFlag29Interface. */
  public static class Default implements io.hextree.attacksurface.services.IFlag29Interface
  {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    @Override public java.lang.String init() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void authenticate(java.lang.String str) throws android.os.RemoteException
    {
    }
    @Override public void success() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements io.hextree.attacksurface.services.IFlag29Interface
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an io.hextree.attacksurface.services.IFlag29Interface interface,
     * generating a proxy if needed.
     */
    public static io.hextree.attacksurface.services.IFlag29Interface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof io.hextree.attacksurface.services.IFlag29Interface))) {
        return ((io.hextree.attacksurface.services.IFlag29Interface)iin);
      }
      return new io.hextree.attacksurface.services.IFlag29Interface.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_init:
        {
          java.lang.String _result = this.init();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_authenticate:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.authenticate(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_success:
        {
          this.success();
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements io.hextree.attacksurface.services.IFlag29Interface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
       * Demonstrates some basic types that you can use as parameters
       * and return values in AIDL.
       */
      @Override public java.lang.String init() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_init, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void authenticate(java.lang.String str) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(str);
          boolean _status = mRemote.transact(Stub.TRANSACTION_authenticate, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void success() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_success, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_authenticate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_success = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "io.hextree.attacksurface.services.IFlag29Interface";
  /**
   * Demonstrates some basic types that you can use as parameters
   * and return values in AIDL.
   */
  public java.lang.String init() throws android.os.RemoteException;
  public void authenticate(java.lang.String str) throws android.os.RemoteException;
  public void success() throws android.os.RemoteException;
}

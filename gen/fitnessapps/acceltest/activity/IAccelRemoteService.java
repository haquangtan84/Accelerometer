/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/tanhq/java/projects/Accelerometer-Logging/src/fitnessapps/acceltest/activity/IAccelRemoteService.aidl
 */
package fitnessapps.acceltest.activity;
public interface IAccelRemoteService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements fitnessapps.acceltest.activity.IAccelRemoteService
{
private static final java.lang.String DESCRIPTOR = "fitnessapps.acceltest.activity.IAccelRemoteService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an fitnessapps.acceltest.activity.IAccelRemoteService interface,
 * generating a proxy if needed.
 */
public static fitnessapps.acceltest.activity.IAccelRemoteService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof fitnessapps.acceltest.activity.IAccelRemoteService))) {
return ((fitnessapps.acceltest.activity.IAccelRemoteService)iin);
}
return new fitnessapps.acceltest.activity.IAccelRemoteService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setGameNameFromService:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setGameNameFromService(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setEndGameFlagFromService:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setEndGameFlagFromService(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements fitnessapps.acceltest.activity.IAccelRemoteService
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
@Override public void setGameNameFromService(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_setGameNameFromService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setEndGameFlagFromService(boolean flag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((flag)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setEndGameFlagFromService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setGameNameFromService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setEndGameFlagFromService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void setGameNameFromService(java.lang.String name) throws android.os.RemoteException;
public void setEndGameFlagFromService(boolean flag) throws android.os.RemoteException;
}

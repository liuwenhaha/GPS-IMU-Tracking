/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package gps_msg;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class gps implements lcm.lcm.LCMEncodable
{
    public float utc_time;
    public float lon;
    public float lat;
    public float alt;
    public float utm_x;
    public float utm_y;
 
    public gps()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xbddacb25f67a23c7L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(gps_msg.gps.class))
            return 0L;
 
        classes.add(gps_msg.gps.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeFloat(this.utc_time); 
 
        outs.writeFloat(this.lon); 
 
        outs.writeFloat(this.lat); 
 
        outs.writeFloat(this.alt); 
 
        outs.writeFloat(this.utm_x); 
 
        outs.writeFloat(this.utm_y); 
 
    }
 
    public gps(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public gps(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static gps_msg.gps _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        gps_msg.gps o = new gps_msg.gps();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utc_time = ins.readFloat();
 
        this.lon = ins.readFloat();
 
        this.lat = ins.readFloat();
 
        this.alt = ins.readFloat();
 
        this.utm_x = ins.readFloat();
 
        this.utm_y = ins.readFloat();
 
    }
 
    public gps_msg.gps copy()
    {
        gps_msg.gps outobj = new gps_msg.gps();
        outobj.utc_time = this.utc_time;
 
        outobj.lon = this.lon;
 
        outobj.lat = this.lat;
 
        outobj.alt = this.alt;
 
        outobj.utm_x = this.utm_x;
 
        outobj.utm_y = this.utm_y;
 
        return outobj;
    }
 
}


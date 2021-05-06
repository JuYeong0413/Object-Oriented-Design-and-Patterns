// 2016111540 이주영

package factory;

public abstract class Motor {
   private MotorStatus motorStatus;
   
   protected abstract void moveMotor(Direction direction);

   public Motor() {
      motorStatus = MotorStatus.STOPPED;
   }
   
   public MotorStatus getMotorStatus() {
      return motorStatus;
   }
   
   private void setMotorStatus(MotorStatus motorStatus) {
      this.motorStatus = motorStatus;
   }
   
   void move(Direction direction) {
      MotorStatus motorStatus = getMotorStatus();
      if (motorStatus == MotorStatus.MOVING)
    	  return;
      moveMotor(direction);
      setMotorStatus(MotorStatus.MOVING);
   }

   void stop() {
	   MotorStatus motorStatus = getMotorStatus();
	   if (motorStatus == MotorStatus.STOPPED)
		   return;
	   setMotorStatus(MotorStatus.STOPPED);
   }
}

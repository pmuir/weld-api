package org.jboss.weld.context;

import javax.enterprise.context.ContextNotActiveException;
import javax.enterprise.context.Conversation;

public interface ManagedConversation extends Conversation
{

   /**
    * Attempts to unlock the conversation
    * 
    * @throws ContextNotActiveException if the conversation context is not
    *            active
    * @return true if the unlock was successful, false otherwise
    */
   public boolean unlock();

   /**
    * Attempts to lock the conversation for exclusive usage
    * 
    * @param timeout The time in milliseconds to wait on the lock
    * @return True if lock was successful, false otherwise
    * @throws InterruptedException if the lock operation was unsuccessful * @throws
    * @throws ContextNotActiveException if the conversation context is not
    *            active
    */
   public boolean lock(long timeout);

   /**
    * Gets the last time the conversation was used (for data access)
    * 
    * @return time (in ms) since the conversation was last used
    * @throws ContextNotActiveException if the conversation context is not
    *            active
    */
   public long getLastUsed();

   /**
    * Touches the managed conversation, updating the "last used" timestamp
    * 
    * @throws ContextNotActiveException if the conversation context is not
    *            active
    */
   public void touch();

}

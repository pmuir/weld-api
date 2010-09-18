package org.jboss.weld.context.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jboss.weld.context.BoundContext;
import org.jboss.weld.context.ConversationContext;

public interface HttpConversationContext extends BoundContext<HttpServletRequest>, ConversationContext
{

   /**
    * <p>
    * If the context is not currently associated with a
    * {@link HttpServletRequest}, then the context will be associated with the
    * specified {@link HttpSession} (for this thread), activated, destroyed, and
    * then deactivated.
    * </p>
    * 
    * <p>
    * If the context is already associated with a {@link HttpServletRequest}
    * then this call will detach the context from the underlying Http Session,
    * and mark the context for destruction when the request is destroyed.
    * </p>
    * 
    * <p>
    * This will cause any transient conversations, and any long running
    * conversations associated with the session, to be destroyed.
    * </p>
    * 
    * @param session the {@link HttpSession} in which to store the bean
    *           instances
    * @return true if the context was destroyed immediately
    */
   public boolean invalidate(HttpSession session);

}

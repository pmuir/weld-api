package org.jboss.weld.context.bound;

import java.util.Map;

import org.jboss.weld.context.BoundContext;
import org.jboss.weld.context.SessionContext;

public interface BoundSessionContext extends SessionContext, BoundContext<Map<String, Object>>
{

}

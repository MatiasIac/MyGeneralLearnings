from random import randint


class InterpreterProxy(object):

    def call(self):
        print 'making request'


class AnInterpreterProxy(InterpreterProxy):

    def __init__(self):
        self.id = randint(12345, 45678)

    def call(self):
        print "hello from proxy id: ", self.id


class Proxy(InterpreterProxy):

    def __init__(self, interpreters):
        self._interpreters = interpreters or []
        self._last_called = None

    def add_interpreter(self, interpreter):
        self._interpreters.append(interpreter)

    def get_interpreters(self):
        return self._interpreters

    def request(self):
        if not self._interpreters:
            raise Exception("No interpreters registered!")

        if self._last_called is None:
            # First call, let's get the first interpreter on the list
            self._last_called = self._interpreters[0]
        else:
            # A new call. Let's get the last called and call the next on the
            # list of interpreters
            last_index = self._interpreters.index(self._last_called)
            new_index = (last_index + 1) % len(self._interpreters)
            self._last_called = self._interpreters[new_index]

        self._last_called.call()

# Instantiate some interpreter handlers for the proxy:
int1 = AnInterpreterProxy()
int2 = AnInterpreterProxy()
int3 = AnInterpreterProxy()
int4 = AnInterpreterProxy()

# Let's create the proxy
p = Proxy(interpreters=[int1, int2, int3])
# We can also add them after Proxy creation
p.add_interpreter(int4)

# Let's make some proxy calls
for _ in range(0, len(p.get__interpreters()) * 3):
    p.request()

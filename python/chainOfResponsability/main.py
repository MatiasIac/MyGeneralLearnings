from abc import ABCMeta, abstractmethod


class ChainBase:
    __metaclass__ = ABCMeta

    _next = None

    def set_next(self, next_block):
        self._next = next_block

    def move_on(self, data):
        if self._next is not None:
            self._next.process(data)

    @abstractmethod
    def process(self, data): pass


class ByShort(ChainBase):
    def process(self, data):
        if len(data) < 4:
            raise Exception('Too short')
        self.move_on(data)


class ByLong(ChainBase):
    def process(self, data):
        if len(data) > 10:
            raise Exception('Too long')
        self.move_on(data)


def main():
    chain = ByShort()
    chain.set_next(ByLong())
    chain.process('tessasddadasdasdsadsad')


if __name__ == '__main__':
    main()